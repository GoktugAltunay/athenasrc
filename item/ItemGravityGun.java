/*     */ package net.mcreator.finfin.item;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.math.RayTraceResult;
/*     */ import net.minecraft.util.math.Vec3d;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.entity.living.LivingEvent;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class ItemGravityGun extends ElementsFinfinMod.ModElement {
/*     */   @ObjectHolder("finfin:gravity_gun")
/*  31 */   public static final Item block = null;
/*     */   
/*     */   private static final double GRAB_DISTANCE = 5.0D;
/*     */   private static final double LIFT_SPEED = 0.5D;
/*     */   private static final double PUSH_SPEED = 1.0D;
/*     */   private static final String GRABBED_ENTITY_NBT = "finfin_gravity_gun_grabbed_entity";
/*  37 */   private static final HashMap<EntityPlayer, Entity> grabbedEntities = new HashMap<>();
/*     */   
/*     */   public ItemGravityGun(ElementsFinfinMod instance) {
/*  40 */     super(instance, 69);
/*  41 */     MinecraftForge.EVENT_BUS.register(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  46 */     this.elements.items.add(() -> new ItemCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  52 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:gravity_gun", "inventory"));
/*     */   }
/*     */   
/*     */   public static class ItemCustom extends Item {
/*     */     public ItemCustom() {
/*  57 */       func_77656_e(0);
/*  58 */       this.field_77777_bU = 1;
/*  59 */       func_77655_b("gravity_gun");
/*  60 */       setRegistryName("gravity_gun");
/*  61 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77619_b() {
/*  66 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/*  71 */       return 72000;
/*     */     }
/*     */ 
/*     */     
/*     */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/*  76 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public void onUsingTick(ItemStack stack, EntityLivingBase entityLiving, int count) {
/*  81 */       if (entityLiving instanceof EntityPlayer) {
/*  82 */         EntityPlayer player = (EntityPlayer)entityLiving;
/*  83 */         World world = player.field_70170_p;
/*  84 */         if (!world.field_72995_K) {
/*  85 */           RayTraceResult rayTraceResult = rayTracePlayers(world, player, 5.0D);
/*  86 */           if (rayTraceResult != null && rayTraceResult.field_72313_a == RayTraceResult.Type.ENTITY && rayTraceResult.field_72308_g instanceof EntityPlayer) {
/*  87 */             Entity targetEntity = rayTraceResult.field_72308_g;
/*  88 */             if (!ItemGravityGun.grabbedEntities.containsKey(player)) {
/*  89 */               ItemGravityGun.grabbedEntities.put(player, targetEntity);
/*  90 */               targetEntity.getEntityData().func_74757_a("finfin_gravity_gun_grabbed_entity", true);
/*  91 */               targetEntity.field_70159_w = 0.0D;
/*  92 */               targetEntity.field_70181_x = 0.0D;
/*  93 */               targetEntity.field_70179_y = 0.0D;
/*  94 */               targetEntity.field_70133_I = true;
/*     */             } 
/*  96 */           } else if (!player.func_70093_af() && ItemGravityGun.grabbedEntities.containsKey(player)) {
/*  97 */             Entity grabbedEntity = (Entity)ItemGravityGun.grabbedEntities.get(player);
/*  98 */             Vec3d lookVec = player.func_70040_Z();
/*  99 */             grabbedEntity.field_70159_w = lookVec.field_72450_a * 1.0D;
/* 100 */             grabbedEntity.field_70181_x = lookVec.field_72448_b * 1.0D;
/* 101 */             grabbedEntity.field_70179_y = lookVec.field_72449_c * 1.0D;
/* 102 */             grabbedEntity.field_70133_I = true;
/* 103 */             ItemGravityGun.grabbedEntities.remove(player);
/* 104 */             grabbedEntity.getEntityData().func_74757_a("finfin_gravity_gun_grabbed_entity", false);
/*     */           } 
/*     */         } 
/*     */       } 
/* 108 */       super.onUsingTick(stack, entityLiving, count);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_77615_a(ItemStack stack, World world, EntityLivingBase entityLiving, int timeLeft) {
/* 113 */       if (entityLiving instanceof EntityPlayer && !world.field_72995_K && ItemGravityGun.grabbedEntities.containsKey(entityLiving)) {
/* 114 */         Entity grabbedEntity = (Entity)ItemGravityGun.grabbedEntities.get(entityLiving);
/* 115 */         ItemGravityGun.grabbedEntities.remove(entityLiving);
/* 116 */         grabbedEntity.getEntityData().func_74757_a("finfin_gravity_gun_grabbed_entity", false);
/*     */       } 
/* 118 */       super.func_77615_a(stack, world, entityLiving, timeLeft);
/*     */     }
/*     */     
/*     */     public RayTraceResult rayTracePlayers(World world, EntityPlayer player, double maxDistance) {
/* 122 */       Vec3d startVec = new Vec3d(player.field_70165_t, player.field_70163_u + player.func_70047_e(), player.field_70161_v);
/* 123 */       Vec3d lookVec = player.func_70040_Z();
/* 124 */       Vec3d endVec = startVec.func_72441_c(lookVec.field_72450_a * maxDistance, lookVec.field_72448_b * maxDistance, lookVec.field_72449_c * maxDistance);
/* 125 */       Entity pointedEntity = null;
/* 126 */       List<Entity> list = world.func_72839_b((Entity)player, player.func_174813_aQ().func_72321_a(lookVec.field_72450_a * maxDistance, lookVec.field_72448_b * maxDistance, lookVec.field_72449_c * maxDistance).func_72321_a(1.0D, 1.0D, 1.0D));
/* 127 */       double minDistanceSq = maxDistance * maxDistance + 1.0D;
/*     */       
/* 129 */       for (Entity entity : list) {
/* 130 */         if (entity != null && !entity.field_70128_L && entity instanceof EntityPlayer) {
/* 131 */           AxisAlignedBB axisalignedbb = entity.func_174813_aQ().func_186662_g(entity.func_70111_Y());
/* 132 */           RayTraceResult raytraceresult = axisalignedbb.func_72327_a(startVec, endVec);
/*     */           
/* 134 */           if (raytraceresult != null) {
/* 135 */             double distanceSq = startVec.func_72436_e(raytraceresult.field_72307_f);
/* 136 */             if (distanceSq < minDistanceSq) {
/* 137 */               pointedEntity = entity;
/* 138 */               minDistanceSq = distanceSq;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 143 */       return (pointedEntity == null) ? null : new RayTraceResult(pointedEntity);
/*     */     }
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onEntityLivingUpdate(LivingEvent.LivingUpdateEvent event) {
/* 149 */     EntityLivingBase entity = event.getEntityLiving();
/* 150 */     if (entity.field_70170_p != null && !entity.field_70170_p.field_72995_K && entity.getEntityData().func_74767_n("finfin_gravity_gun_grabbed_entity"))
/* 151 */       for (Map.Entry<EntityPlayer, Entity> entry : grabbedEntities.entrySet()) {
/* 152 */         if (((Entity)entry.getValue()).equals(entity)) {
/* 153 */           EntityPlayer player = entry.getKey();
/* 154 */           double liftY = 0.5D;
/* 155 */           if (player.func_70093_af()) {
/* 156 */             liftY = -0.5D;
/*     */           }
/* 158 */           Vec3d targetPos = player.func_174791_d().func_178787_e(player.func_70040_Z().func_186678_a(4.0D));
/* 159 */           double deltaX = targetPos.field_72450_a - entity.field_70165_t;
/* 160 */           double deltaY = targetPos.field_72448_b + entity.field_70131_O / 2.0D - entity.field_70163_u;
/* 161 */           double deltaZ = targetPos.field_72449_c - entity.field_70161_v;
/*     */           
/* 163 */           entity.field_70159_w = deltaX * 0.1D;
/* 164 */           entity.field_70181_x = deltaY * 0.1D + liftY * 0.5D;
/* 165 */           entity.field_70179_y = deltaZ * 0.1D;
/* 166 */           entity.field_70133_I = true;
/*     */           break;
/*     */         } 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemGravityGun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */