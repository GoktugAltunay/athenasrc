/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.HashMap;
/*    */ import java.util.Set;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.SharedMonsterAttributes;
/*    */ import net.minecraft.entity.ai.attributes.AttributeModifier;
/*    */ import net.minecraft.inventory.EntityEquipmentSlot;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Tag
/*    */ public class ItemMatryoshka1545Staff
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:matryoshka_1545_staff")
/* 30 */   public static final Item block = null;
/*    */   public ItemMatryoshka1545Staff(ElementsFinfinMod instance) {
/* 32 */     super(instance, 81);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 37 */     this.elements.items.add(() -> ((Item)(new ItemSword(EnumHelper.addToolMaterial("MATRYOSHKA_1545_STAFF", 1, 99999, 4.0F, 8.0F, 2))
/*    */         {
/*    */           public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot slot) {
/* 40 */             Multimap<String, AttributeModifier> multimap = super.func_111205_h(slot);
/* 41 */             if (slot == EntityEquipmentSlot.MAINHAND) {
/* 42 */               multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", 
/* 43 */                     func_150931_i(), 0));
/* 44 */               multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Weapon modifier", -3.0D, 0));
/*    */             } 
/*    */             
/* 47 */             return multimap;
/*    */           }
/*    */           
/*    */           public Set<String> getToolClasses(ItemStack stack) {
/* 51 */             HashMap<Object, Object> ret = new HashMap<>();
/* 52 */             ret.put("sword", Integer.valueOf(1));
/* 53 */             return ret.keySet();
/*    */           }
/*    */         }).func_77655_b("matryoshka_1545_staff").setRegistryName("matryoshka_1545_staff")).func_77637_a(TabAminake.tab));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 61 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:matryoshka_1545_staff", "inventory"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemMatryoshka1545Staff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */