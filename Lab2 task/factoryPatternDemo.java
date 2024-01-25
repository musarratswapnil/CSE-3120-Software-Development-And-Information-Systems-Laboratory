public class FactoryPatternDemo {
     public static void main(String[] args) {
         shapefactory shapeFactory = new shapefactory(); 
         Shape shape1 = shapesactory.getShape("CIRCLE");
         shape1.draw(); 
         Shape shape2 = shapeFactory.getShape("RECTANGLE");
         shape2.draw(); 
         } 
         }