/*     */ package net.mcreator.finfin.item;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.MobEffects;
/*     */ import net.minecraft.init.SoundEvents;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundCategory;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.util.math.Vec3d;
/*     */ import net.minecraft.world.GameType;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Tag
/*     */ public class ItemMobPicker
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:mob_picker")
/*  41 */   public static final Item block = null;
/*     */   
/*     */   public ItemMobPicker(ElementsFinfinMod instance) {
/*  44 */     super(instance, 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  49 */     this.elements.items.add(() -> new ItemCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  55 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:mob_picker", "inventory"));
/*     */   }
/*     */   
/*     */   public static class ItemCustom extends Item {
/*     */     public ItemCustom() {
/*  60 */       func_77656_e(0);
/*  61 */       this.field_77777_bU = 1;
/*  62 */       func_77655_b("mob_picker");
/*  63 */       setRegistryName("mob_picker");
/*  64 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77619_b() {
/*  69 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/*  74 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/*  79 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/*  84 */       ItemStack stack = player.func_184586_b(hand);
/*     */       
/*  86 */       if (!world.field_72995_K) {
/*  87 */         NBTTagCompound nbt = stack.func_190925_c("player_data");
/*     */         
/*  89 */         if (nbt.func_74767_n("kullanildi")) {
/*  90 */           return new ActionResult(EnumActionResult.FAIL, stack);
/*     */         }
/*     */         
/*  93 */         Entity target = getEntityLookingAt(player, world);
/*     */         
/*  95 */         if (target instanceof EntityPlayer || (target != null && target.getClass().getSimpleName().contains("Entity"))) {
/*  96 */           if (target instanceof EntityPlayer) {
/*  97 */             EntityPlayer targetPlayer = (EntityPlayer)target;
/*  98 */             targetPlayer.func_71033_a(GameType.SPECTATOR);
/*     */             
/* 100 */             targetPlayer.func_70634_a(targetPlayer.field_70165_t, -26.0D, targetPlayer.field_70161_v);
/* 101 */             targetPlayer.func_70690_d(new PotionEffect(MobEffects.field_76440_q, 2147483647, 0, false, false));
/*     */             
/* 103 */             nbt.func_74778_a("player_name", targetPlayer.func_70005_c_());
/* 104 */             nbt.func_74757_a("kullanildi", true);
/*     */             
/* 106 */             stack.func_151001_c(targetPlayer.func_70005_c_());
/*     */             
/* 108 */             player.field_70170_p.func_184148_a(null, player.field_70165_t, player.field_70163_u, player.field_70161_v, SoundEvents.field_187638_cR, SoundCategory.PLAYERS, 1.0F, 1.0F);
/*     */ 
/*     */             
/* 111 */             return new ActionResult(EnumActionResult.SUCCESS, stack);
/*     */           } 
/* 113 */           String mobId = EntityList.func_191301_a(target).toString();
/* 114 */           NBTTagCompound mobData = stack.func_190925_c("mob_data");
/*     */           
/* 116 */           mobData.func_74778_a("mob_id", mobId);
/* 117 */           nbt.func_74757_a("kullanildi", true);
/*     */           
/* 119 */           String mobName = target.func_70005_c_();
/* 120 */           stack.func_151001_c(mobName);
/*     */           
/* 122 */           target.func_70106_y();
/*     */           
/* 124 */           player.field_70170_p.func_184148_a(null, player.field_70165_t, player.field_70163_u, player.field_70161_v, SoundEvents.field_187638_cR, SoundCategory.PLAYERS, 1.0F, 1.0F);
/*     */ 
/*     */           
/* 127 */           return new ActionResult(EnumActionResult.SUCCESS, stack);
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 132 */       return new ActionResult(EnumActionResult.PASS, stack);
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumActionResult func_180614_a(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
/* 137 */       ItemStack stack = player.func_184586_b(hand);
/* 138 */       if (!world.field_72995_K) {
/* 139 */         NBTTagCompound nbt = stack.func_179543_a("player_data");
/* 140 */         if (nbt != null && nbt.func_74764_b("player_name")) {
/* 141 */           String playerName = nbt.func_74779_i("player_name");
/* 142 */           EntityPlayer targetPlayer = world.func_72924_a(playerName);
/* 143 */           if (targetPlayer != null) {
/* 144 */             targetPlayer.func_70634_a(pos.func_177958_n() + 0.5D, (pos.func_177956_o() + 1), pos.func_177952_p() + 0.5D);
/* 145 */             targetPlayer.func_71033_a(GameType.SURVIVAL);
/*     */             
/* 147 */             targetPlayer.func_184589_d(MobEffects.field_76440_q);
/*     */             
/* 149 */             player.field_70170_p.func_184148_a(null, player.field_70165_t, player.field_70163_u, player.field_70161_v, SoundEvents.field_187638_cR, SoundCategory.PLAYERS, 1.0F, 1.0F);
/*     */             
/* 151 */             player.func_184611_a(hand, ItemStack.field_190927_a);
/* 152 */             return EnumActionResult.SUCCESS;
/*     */           } 
/*     */         } else {
/* 155 */           NBTTagCompound mobNbt = stack.func_179543_a("mob_data");
/* 156 */           if (mobNbt != null && mobNbt.func_74764_b("mob_id")) {
/* 157 */             String mobId = mobNbt.func_74779_i("mob_id");
/* 158 */             Entity entity = EntityList.func_188429_b(new ResourceLocation(mobId), world);
/* 159 */             if (entity != null) {
/* 160 */               entity.func_70107_b(pos.func_177958_n() + 0.5D, (pos.func_177956_o() + 1), pos.func_177952_p() + 0.5D);
/* 161 */               world.func_72838_d(entity);
/* 162 */               player.field_70170_p.func_184148_a(null, player.field_70165_t, player.field_70163_u, player.field_70161_v, SoundEvents.field_187638_cR, SoundCategory.PLAYERS, 1.0F, 1.0F);
/*     */               
/* 164 */               player.func_184611_a(hand, ItemStack.field_190927_a);
/* 165 */               return EnumActionResult.SUCCESS;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 170 */       return EnumActionResult.PASS;
/*     */     }
/*     */     
/*     */     private Entity getEntityLookingAt(EntityPlayer player, World world) {
/* 174 */       Vec3d eyePosition = player.func_174824_e(1.0F);
/* 175 */       Vec3d lookVector = player.func_70676_i(1.0F);
/* 176 */       Vec3d reachVector = eyePosition.func_178787_e(lookVector.func_186678_a(5.0D));
/* 177 */       List<Entity> entities = world.func_72839_b((Entity)player, player.func_174813_aQ().func_186662_g(5.0D));
/* 178 */       Entity closestEntity = null;
/* 179 */       double closestDistance = Double.MAX_VALUE;
/*     */       
/* 181 */       for (Entity entity : entities) {
/* 182 */         if ((entity instanceof EntityPlayer || (entity.getClass().getSimpleName().contains("Entity") && !(entity instanceof net.minecraft.entity.item.EntityItem) && !(entity instanceof net.minecraft.entity.item.EntityMinecart) && !(entity instanceof net.minecraft.entity.item.EntityBoat))) && entity.func_174813_aQ().func_72327_a(eyePosition, reachVector) != null) {
/* 183 */           double distance = eyePosition.func_72438_d(entity.func_174791_d());
/* 184 */           if (distance < closestDistance) {
/* 185 */             closestDistance = distance;
/* 186 */             closestEntity = entity;
/*     */           } 
/*     */         } 
/*     */       } 
/* 190 */       return closestEntity;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemMobPicker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */