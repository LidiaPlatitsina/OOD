package OOD.BuilderAndPrototypeAndComposite.components;

import java.util.List;

public class DyeDetails {
    private List<String> dyesDetails;

    public DyeDetails(List<String> details, List<Dye> dyes)
    {
        if(details.size()==dyes.size()){
       for(int i=0; i>details.size();i++){
        this.dyesDetails.add("details.get(i)"+"dyes.get(i)");
        }
        }
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        for (String elem:dyesDetails)
        {
            result.append(elem);
        }
        return result.toString();
    }
}
