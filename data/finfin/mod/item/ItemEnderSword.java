/*     */ package data.finfin.mod.item;
/*     */ 
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.attributes.AttributeModifier;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.EntityEquipmentSlot;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.ItemSword;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.util.text.ITextComponent;
/*     */ import net.minecraft.util.text.TextComponentString;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.common.util.EnumHelper;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class ItemEnderSword
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:ender_sword")
/*  38 */   public static final Item block = null;
/*     */   private static final String NBT_KEY_X = "TeleportX";
/*     */   private static final String NBT_KEY_Y = "TeleportY";
/*     */   private static final String NBT_KEY_Z = "TeleportZ";
/*     */   private static final String SWORD_TOOL_CLASS = "sword";
/*     */   private static final String WEAPON_MODIFIER = "Weapon modifier";
/*     */   private static final double TELEPORT_RAY_TRACE_DISTANCE = 5.0D;
/*     */   private static final float TELEPORT_RAY_TRACE_PARTIAL_TICKS = 1.0F;
/*     */   
/*     */   public ItemEnderSword(ElementsFinfinMod instance) {
/*  48 */     super(instance, 20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  53 */     this.elements.items.add(() -> ((Item)(new ItemSword(EnumHelper.addToolMaterial("ENDERSWORD", 1, 700, 4.0F, 0.0F, 2))
/*     */         {
/*     */           public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot slot) {
/*  56 */             Multimap<String, AttributeModifier> multimap = super.func_111205_h(slot);
/*  57 */             if (slot == EntityEquipmentSlot.MAINHAND) {
/*  58 */               multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", 
/*  59 */                     func_150931_i(), 0));
/*  60 */               multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Weapon modifier", -3.0D, 0));
/*     */             } 
/*     */             
/*  63 */             return multimap;
/*     */           }
/*     */ 
/*     */           
/*     */           public Set<String> getToolClasses(ItemStack stack) {
/*  68 */             return Collections.singleton("sword");
/*     */           }
/*     */ 
/*     */           
/*     */           public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/*  73 */             ItemStack stack = player.func_184586_b(hand);
/*  74 */             BlockPos pos = player.func_174822_a(5.0D, 1.0F).func_178782_a();
/*     */             
/*  76 */             if (pos != null) {
/*  77 */               NBTTagCompound nbt = stack.func_77978_p();
/*  78 */               if (nbt == null) {
/*  79 */                 nbt = new NBTTagCompound();
/*     */               }
/*  81 */               nbt.func_74768_a("TeleportX", pos.func_177958_n());
/*  82 */               nbt.func_74768_a("TeleportY", pos.func_177956_o() + 1);
/*  83 */               nbt.func_74768_a("TeleportZ", pos.func_177952_p());
/*  84 */               stack.func_77982_d(nbt);
/*     */               
/*  86 */               if (!world.field_72995_K) {
/*  87 */                 player.func_145747_a((ITextComponent)new TextComponentString("Koordinatlar kaydedildi: " + pos
/*  88 */                       .func_177958_n() + ", " + (pos.func_177956_o() + 1) + ", " + pos.func_177952_p()));
/*     */               }
/*  90 */               return new ActionResult(EnumActionResult.SUCCESS, stack);
/*     */             } 
/*  92 */             return new ActionResult(EnumActionResult.FAIL, stack);
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
/*  97 */             if (attacker instanceof EntityPlayer) {
/*  98 */               EntityPlayer player = (EntityPlayer)attacker;
/*  99 */               NBTTagCompound nbt = stack.func_77978_p();
/* 100 */               if (nbt != null && nbt.func_74764_b("TeleportX")) {
/* 101 */                 int x = nbt.func_74762_e("TeleportX");
/* 102 */                 int y = nbt.func_74762_e("TeleportY");
/* 103 */                 int z = nbt.func_74762_e("TeleportZ");
/* 104 */                 target.func_70634_a(x + 0.5D, y, z + 0.5D);
/* 105 */                 if (!player.field_70170_p.field_72995_K) {
/* 106 */                   player.func_145747_a((ITextComponent)new TextComponentString("Hedef teleport edildi: " + x + ", " + y + ", " + z));
/*     */                 
/*     */                 }
/*     */               }
/* 110 */               else if (!player.field_70170_p.field_72995_K) {
/* 111 */                 player.func_145747_a((ITextComponent)new TextComponentString("Lütfen ilk önce bir bloka sağ tıklayarak onun koordinatını kaydet."));
/*     */               } 
/*     */             } 
/*     */ 
/*     */             
/* 116 */             return super.func_77644_a(stack, target, attacker);
/*     */           }
/*     */         }).func_77655_b("ender_sword").setRegistryName("finfin:ender_sword")).func_77637_a(TabAminake.tab));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/* 124 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:ender_sword", "inventory"));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\data\finfin\mod\item\ItemEnderSword.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */