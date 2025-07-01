/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
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
/*    */ public class ItemCrown
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:crownhelmet")
/* 23 */   public static final Item helmet = null;
/*    */   @ObjectHolder("finfin:crownbody")
/* 25 */   public static final Item body = null;
/*    */   @ObjectHolder("finfin:crownlegs")
/* 27 */   public static final Item legs = null;
/*    */   @ObjectHolder("finfin:crownboots")
/* 29 */   public static final Item boots = null;
/*    */   public ItemCrown(ElementsFinfinMod instance) {
/* 31 */     super(instance, 52);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 36 */     ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CROWN", "finfin:gold_", 25, new int[] { 2, 5, 6, 2 }, 9, (SoundEvent)SoundEvent.field_187505_a
/* 37 */         .func_82594_a(new ResourceLocation("")), 0.0F);
/* 38 */     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD)).func_77655_b("crownhelmet").setRegistryName("crownhelmet")).func_77637_a(TabAminake.tab));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 45 */     ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("finfin:crownhelmet", "inventory"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemCrown.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */