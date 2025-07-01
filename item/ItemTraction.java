/*     */ package net.mcreator.finfin.item;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Set;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemPickaxe;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.math.Vec3d;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.common.util.EnumHelper;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Tag
/*     */ public class ItemTraction
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:traction")
/*  41 */   public static final Item TRACTION = null;
/*     */   
/*     */   public ItemTraction(ElementsFinfinMod instance) {
/*  44 */     super(instance, 17);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  49 */     this.elements.items.add(() -> ((Item)(new ItemPickaxe(EnumHelper.addToolMaterial("TRACTION", 1, 99999, 1.0F, -4.0F, 1))
/*     */         {
/*     */ 
/*     */ 
/*     */           
/*     */           public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand)
/*     */           {
/*  56 */             ItemStack itemstack = player.func_184586_b(hand);
/*  57 */             if (!world.field_72995_K) {
/*  58 */               for (Entity entity : world.func_72872_a(Entity.class, player.func_174813_aQ().func_186662_g(10.0D))) {
/*  59 */                 if (isPullableEntity(entity)) {
/*  60 */                   pullEntityTowardsPlayer(entity, player);
/*     */                 }
/*     */               } 
/*     */             }
/*  64 */             return new ActionResult(EnumActionResult.SUCCESS, itemstack);
/*     */           }
/*     */           
/*     */           private boolean isPullableEntity(Entity entity) {
/*  68 */             return (entity instanceof EntityPlayer || entity instanceof net.minecraft.entity.passive.EntityCow || entity instanceof net.minecraft.entity.passive.EntityDonkey || entity instanceof net.minecraft.entity.passive.EntityHorse || entity instanceof net.minecraft.entity.passive.EntityPig || entity instanceof net.minecraft.entity.passive.EntityVillager || entity instanceof net.minecraft.entity.passive.EntitySheep || entity instanceof net.minecraft.entity.passive.EntityChicken || entity instanceof net.minecraft.entity.passive.EntityWolf || entity instanceof net.minecraft.entity.passive.EntityLlama);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           private void pullEntityTowardsPlayer(Entity entity, EntityPlayer player) {
/*  81 */             Vec3d direction = (new Vec3d(player.field_70165_t - entity.field_70165_t, player.field_70163_u - entity.field_70163_u, player.field_70161_v - entity.field_70161_v)).func_72432_b();
/*  82 */             double pullStrength = 0.15D;
/*  83 */             entity.field_70159_w += direction.field_72450_a * pullStrength;
/*  84 */             entity.field_70181_x += direction.field_72448_b * pullStrength;
/*  85 */             entity.field_70179_y += direction.field_72449_c * pullStrength;
/*     */           }
/*     */ 
/*     */           
/*     */           public Set<String> getToolClasses(ItemStack stack) {
/*  90 */             HashMap<Object, Object> ret = new HashMap<>();
/*  91 */             ret.put("pickaxe", Integer.valueOf(1));
/*  92 */             return ret.keySet();
/*     */           }
/*     */         }).func_77655_b("traction").setRegistryName("traction")).func_77637_a(TabAminake.tab));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/* 100 */     ModelLoader.setCustomModelResourceLocation(TRACTION, 0, new ModelResourceLocation("finfin:traction", "inventory"));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemTraction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */