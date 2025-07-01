/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.inventory.EntityEquipmentSlot;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemArmor;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraft.util.SoundEvent;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemIceDragonSteel
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:ice_dragon_steelhelmet")
/* 22 */   public static final Item helmet = null;
/*    */   @ObjectHolder("finfin:ice_dragon_steelbody")
/* 24 */   public static final Item body = null;
/*    */   @ObjectHolder("finfin:ice_dragon_steellegs")
/* 26 */   public static final Item legs = null;
/*    */   @ObjectHolder("finfin:ice_dragon_steelboots")
/* 28 */   public static final Item boots = null;
/*    */   public ItemIceDragonSteel(ElementsFinfinMod instance) {
/* 30 */     super(instance, 85);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 35 */     ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ICE_DRAGON_STEEL", "finfin:icesteels", 25, new int[] { 2, 5, 6, 2 }, 9, (SoundEvent)SoundEvent.field_187505_a
/* 36 */         .func_82594_a(new ResourceLocation("")), 0.0F);
/* 37 */     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD)).func_77655_b("ice_dragon_steelhelmet").setRegistryName("ice_dragon_steelhelmet")).func_77637_a(null));
/*    */     
/* 39 */     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST)).func_77655_b("ice_dragon_steelbody").setRegistryName("ice_dragon_steelbody")).func_77637_a(null));
/*    */     
/* 41 */     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS)).func_77655_b("ice_dragon_steellegs").setRegistryName("ice_dragon_steellegs")).func_77637_a(null));
/*    */     
/* 43 */     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET)).func_77655_b("ice_dragon_steelboots").setRegistryName("ice_dragon_steelboots")).func_77637_a(null));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 50 */     ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("finfin:ice_dragon_steelhelmet", "inventory"));
/* 51 */     ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("finfin:ice_dragon_steelbody", "inventory"));
/* 52 */     ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("finfin:ice_dragon_steellegs", "inventory"));
/* 53 */     ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("finfin:ice_dragon_steelboots", "inventory"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemIceDragonSteel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */