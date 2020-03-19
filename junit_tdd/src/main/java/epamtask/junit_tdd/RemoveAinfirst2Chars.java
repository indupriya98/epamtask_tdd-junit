package epamtask.junit_tdd;

public class RemoveAinfirst2Chars {
       public String remove(String actual) {
    	   String result="";
           
        	   if(actual.charAt(0)=='A' && actual.charAt(1)=='A'){
        		   result=result+actual.substring(2);
        	   }
        	   else if(actual.charAt(0)=='A'){
        		   result=result+actual.substring(1);
        	   }
        	   else if(actual.charAt(1)=='A'){
        		   result=result+actual.substring(0,1)+actual.substring(2);
        	   }
        	   else{
        		   result=result+actual;
        	   }
         
return result;
}
}