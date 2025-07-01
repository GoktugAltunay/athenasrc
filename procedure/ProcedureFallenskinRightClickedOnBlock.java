/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.block.BlockGorunmezblock;
/*    */ import net.mcreator.finfin.item.ItemFallenskin;
/*    */ import net.minecraft.block.properties.IProperty;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureFallenskinRightClickedOnBlock extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureFallenskinRightClickedOnBlock(ElementsFinfinMod instance) {
/* 20 */     super(instance, 4);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 24 */     if (dependencies.get("entity") == null) {
/* 25 */       System.err.println("Failed to load dependency entity for procedure FallenskinRightClickedOnBlock!");
/*    */       return;
/*    */     } 
/* 28 */     if (dependencies.get("x") == null) {
/* 29 */       System.err.println("Failed to load dependency x for procedure FallenskinRightClickedOnBlock!");
/*    */       return;
/*    */     } 
/* 32 */     if (dependencies.get("y") == null) {
/* 33 */       System.err.println("Failed to load dependency y for procedure FallenskinRightClickedOnBlock!");
/*    */       return;
/*    */     } 
/* 36 */     if (dependencies.get("z") == null) {
/* 37 */       System.err.println("Failed to load dependency z for procedure FallenskinRightClickedOnBlock!");
/*    */       return;
/*    */     } 
/* 40 */     if (dependencies.get("world") == null) {
/* 41 */       System.err.println("Failed to load dependency world for procedure FallenskinRightClickedOnBlock!");
/*    */       return;
/*    */     } 
/* 44 */     Entity entity = (Entity)dependencies.get("entity");
/* 45 */     int x = ((Integer)dependencies.get("x")).intValue();
/* 46 */     int y = ((Integer)dependencies.get("y")).intValue();
/* 47 */     int z = ((Integer)dependencies.get("z")).intValue();
/* 48 */     World world = (World)dependencies.get("world");
/*    */     
/* 50 */     BlockPos _bp = new BlockPos(x, y + 1, z);
/* 51 */     IBlockState _bs = BlockGorunmezblock.block.func_176223_P();
/* 52 */     IBlockState _bso = world.func_180495_p(_bp);
/* 53 */     for (UnmodifiableIterator<Map.Entry<IProperty<?>, Comparable<?>>> unmodifiableIterator = _bso.func_177228_b().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<IProperty<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 54 */       IProperty _property = entry.getKey();
/* 55 */       if (_bs.func_177227_a().contains(_property))
/* 56 */         _bs = _bs.func_177226_a(_property, entry.getValue());  }
/*    */     
/* 58 */     world.func_180501_a(_bp, _bs, 3);
/*    */     
/* 60 */     if (entity instanceof EntityPlayer)
/* 61 */       ((EntityPlayer)entity).field_71071_by.func_174925_a((new ItemStack(ItemFallenskin.block, 1)).func_77973_b(), -1, 1, null); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureFallenskinRightClickedOnBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */