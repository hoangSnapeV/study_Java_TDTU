package test_document;

public class string_buffer {
    
        public static void main(String args[]) {
        
         StringBuffer sb = new StringBuffer();
         System.out.println(sb.capacity());//mặc định là 16  
        //  sb.append("Hello");
        //  System.out.println(sb.capacity());//đến đây vẫn là 16  
        //  sb.append("java is my favourite language");
        //  System.out.println(sb.capacity());//đến đây là (16*2)+2=34 i.e (dung lượng cũ*2)+2  
        }
    
}
