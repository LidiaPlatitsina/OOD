package OOD.IteratorAndVisitor.iterator;

import OOD.IteratorAndVisitor.clothingStore.Store;
import OOD.IteratorAndVisitor.clothingStore.childrenDepartment.ChildrenDepartment;
import OOD.IteratorAndVisitor.clothingStore.menDepartment.MenDepartment;
import OOD.IteratorAndVisitor.clothingStore.womenDepartment.WomenDepartment;

public class Iterator {
   private int index=-1;


    public boolean hasNext(){
        if(index == -1 || index==0 || index == 1) {return true;}
        return false;
    }

    public Store next()
    {
        if(index ==-1) {
            index =0;
        return new WomenDepartment(); }
        if(index == 0){
            index=1;
         return new MenDepartment();
        }
        if(index == 1){
            index =2;
            return new ChildrenDepartment();
        }
        return null;
    }

}
