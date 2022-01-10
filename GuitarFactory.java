 
public class GuitarFactory {
public Guitars getInstance (String type) {
 if (type == null) { return null;}

 if ("Classic".equals(type)) {
     return new Classic();
 }  
 else if ("Flamenco".equals(type)) {
     return new Flamenco();
 }
 else if ("SingleCut".equals(type)) {
    return new SingleCut();
 }  
 else if ("Stratocaster".equals(type)) {
    return new Stratocaster();
 }  
 else { System.out.println("We don't sell that here.");
}
return null;
}

}
