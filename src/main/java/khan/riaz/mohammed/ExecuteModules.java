package khan.riaz.mohammed;
import addModule.AddImp;
import modulusModule.ModImp;
import percentModule.PercImp;
import subtractModule.SubImp;

public class ExecuteModules {



    public static void main(String[] args) {

        //this will execute the modules.

        AddImp add = new AddImp();
        ModImp mod = new ModImp();
        SubImp sub = new SubImp();
        PercImp percent = new PercImp();

        System.out.println(add.add(1,2));

        System.out.println(mod.mod(5, 4));

        System.out.println(sub.sub(9, 5));

        System.out.println(percent.percent(65, 20));


    }


}
