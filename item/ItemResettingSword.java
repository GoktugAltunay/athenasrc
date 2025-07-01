/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.mcreator.finfin.procedure.ProcedureResettingSwordLivingEntityIsHitWithTool;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.SharedMonsterAttributes;
/*    */ import net.minecraft.entity.ai.attributes.AttributeModifier;
/*    */ import net.minecraft.inventory.EntityEquipmentSlot;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import net.minecraft.world.World;
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
/*    */ public class ItemResettingSword
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:resetting_sword")
/* 34 */   public static final Item block = null;
/*    */   public ItemResettingSword(ElementsFinfinMod instance) {
/* 36 */     super(instance, 47);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 41 */     this.elements.items.add(() -> ((Item)(new ItemSword(EnumHelper.addToolMaterial("RESETTING_SWORD", 1, 99999, 4.0F, -2.0F, 2))
/*    */         {
/*    */           public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot slot) {
/* 44 */             Multimap<String, AttributeModifier> multimap = super.func_111205_h(slot);
/* 45 */             if (slot == EntityEquipmentSlot.MAINHAND) {
/* 46 */               multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", 
/* 47 */                     func_150931_i(), 0));
/* 48 */               multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Weapon modifier", -3.0D, 0));
/*    */             } 
/*    */             
/* 51 */             return multimap;
/*    */           }
/*    */           
/*    */           public Set<String> getToolClasses(ItemStack stack) {
/* 55 */             HashMap<Object, Object> ret = new HashMap<>();
/* 56 */             ret.put("sword", Integer.valueOf(1));
/* 57 */             return ret.keySet();
/*    */           }
/*    */ 
/*    */           
/*    */           public boolean func_77644_a(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase entity2) {
/* 62 */             super.func_77644_a(itemstack, entity, entity2);
/* 63 */             int x = (int)entity.field_70165_t;
/* 64 */             int y = (int)entity.field_70163_u;
/* 65 */             int z = (int)entity.field_70161_v;
/* 66 */             World world = entity.field_70170_p;
/*    */             
/* 68 */             Map<Object, Object> $_dependencies = new HashMap<>();
/* 69 */             $_dependencies.put("entity", entity);
/* 70 */             ProcedureResettingSwordLivingEntityIsHitWithTool.executeProcedure($_dependencies);
/*    */             
/* 72 */             return true;
/*    */           }
/*    */         }).func_77655_b("resetting_sword").setRegistryName("resetting_sword")).func_77637_a(TabAminake.tab));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 80 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:resetting_sword", "inventory"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemResettingSword.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */