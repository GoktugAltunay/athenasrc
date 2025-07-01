/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.HashMap;
/*    */ import java.util.Set;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.SharedMonsterAttributes;
/*    */ import net.minecraft.entity.ai.attributes.AttributeModifier;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.MobEffects;
/*    */ import net.minecraft.inventory.EntityEquipmentSlot;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.util.ActionResult;
/*    */ import net.minecraft.util.EnumActionResult;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.GameType;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemCodemanSword
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:codeman_sword")
/* 38 */   public static final Item block = null;
/*    */   
/*    */   public ItemCodemanSword(ElementsFinfinMod instance) {
/* 41 */     super(instance, 10);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 46 */     this.elements.items.add(() -> ((Item)(new ItemSword(EnumHelper.addToolMaterial("CODEMAN_SWORD", 1, 99999, 4.0F, 1.0F, 2))
/*    */         {
/*    */           public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot slot) {
/* 49 */             Multimap<String, AttributeModifier> multimap = super.func_111205_h(slot);
/* 50 */             if (slot == EntityEquipmentSlot.MAINHAND) {
/* 51 */               multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", 
/* 52 */                     func_150931_i(), 0));
/* 53 */               multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Weapon modifier", -3.0D, 0));
/*    */             } 
/*    */             
/* 56 */             return multimap;
/*    */           }
/*    */           
/*    */           public Set<String> getToolClasses(ItemStack stack) {
/* 60 */             HashMap<Object, Object> ret = new HashMap<>();
/* 61 */             ret.put("sword", Integer.valueOf(1));
/* 62 */             return ret.keySet();
/*    */           }
/*    */ 
/*    */           
/*    */           public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/* 67 */             ItemStack itemstack = player.func_184586_b(hand);
/* 68 */             return new ActionResult(EnumActionResult.SUCCESS, itemstack);
/*    */           }
/*    */ 
/*    */           
/*    */           public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
/* 73 */             if (!target.field_70170_p.field_72995_K) {
/*    */               
/* 75 */               target.func_70690_d(new PotionEffect(MobEffects.field_76436_u, 200, 1));
/*    */               
/* 77 */               if (target instanceof EntityPlayer) {
/* 78 */                 EntityPlayer targetPlayer = (EntityPlayer)target;
/*    */ 
/*    */                 
/* 81 */                 targetPlayer.func_71033_a(GameType.SPECTATOR);
/*    */ 
/*    */                 
/* 84 */                 BlockPos newPos = targetPlayer.func_180425_c().func_177981_b(250);
/* 85 */                 targetPlayer.func_70634_a(newPos.func_177958_n(), newPos.func_177956_o(), newPos.func_177952_p());
/*    */               } 
/*    */             } 
/* 88 */             return super.func_77644_a(stack, target, attacker);
/*    */           }
/*    */         }).func_77655_b("codeman_sword").setRegistryName("codeman_sword")).func_77637_a(TabAminake.tab));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 96 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:codeman_sword", "inventory"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemCodemanSword.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */