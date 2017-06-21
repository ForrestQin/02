package lee;

import org.hibernate.cfg.AnnotationConfiguration;  
import org.hibernate.cfg.Configuration;  
import org.hibernate.tool.hbm2ddl.SchemaExport;  
  
public class Test {  
    public static void main(String[]args){  
        Configuration cfg=new AnnotationConfiguration();  
        cfg.configure();  
        SchemaExport export =new SchemaExport(cfg);  
        //export.drop(true, true);  
        export.create(true, true);  
    }  
}  
