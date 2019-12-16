/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeefficiency;

import java.util.Scanner;

/**
 *
 * @author Pasan
 */
public class TimeEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //linear search
     /*   Random rd = new Random(); // creating Random object
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(); */
        int i;
        Scanner obj=new Scanner(System.in);
        int arr[] = new int[10000];
         for( i=0;i<arr.length;i++){
            arr[i]=i+1;
            //System.out.println(arr[i]);
        }
         System.out.println("Enter the search value:");
         int y=obj.nextInt();
         
        long Time1=System.nanoTime();
         for( i=0;i<10000;i++){
             if (arr[i]==y){
                 System.out.println("Reach to the "+y+" value");
                 break;
             }
         }
            if(i==10000){
                System.out.println(y+ " doesn't exist in array");
    }
             
        long Time2=System.nanoTime();
        System.out.println(Time2-Time1);
        
        //Binary search
        /*
        int first=0;
        int last=10000-1;
        int middle=(first+last)/2;
        
        long Time1 =System.nanoTime();
        while(first<=last){
            if(arr[middle]<y){
                first=middle+1;
            }else if(arr[middle]==y){
                System.out.println(y + " found at location "+(middle +1));
                break;
            }
            else{
                last=middle -1;
            }
            middle=(first+last)/2;
        }
          if(first>last)
              System.out.println(y+" is not found\n");
        long Time2 =System.nanoTime();
        System.out.println(Time2-Time1);
*/
        
        //Jump search
        /*
        int n=arr.length;
        int step=(int)Math.floor(Math.sqrt(n));
        
        int prev=0;
        long Time1 =System.nanoTime();
        while (arr[Math.min(step,n)-1]<y){
            prev=step;
            step  +=(int)Math.floor(Math.sqrt(n));
          //  if(prev >= n)
              //  return -1;
    }
        while (arr[prev]<y){
            prev++;
            
           // if(prev == Math.min(step, n))
            //   // return -1;
        }
        
        if(arr[prev]==y)
           // return prev;
        
             System.out.println(y + " found at location "+(prev));
             //   break;
            long Time2 =System.nanoTime();
            System.out.println(Time2-Time1);
       // }
     //  return -1;
        
       // System.out.println("");
            
        
        
        //Interpolation search
     /*   int l=0;
        int h=(arr.length -1);
        
        while(l<=h && y >= arr[l] && y <= arr[h]){
            if(l==h){
                //if(arr[l] ==y)
                 // return l;
                 //  return -1;
                    
                   }
            int pos = l +(((h-l)/
                    (arr[h]-arr[l])*(y-arr[l])));
            
            if (arr[pos]==y)
             //   return pos;
            
            if (arr[pos]<y)
                l= pos+1;
            
            else
                h=pos-1;
            
        }
      //  return -1;
        //int index = interpolationSearch(x); 
        
    }
        int index=arr[y];
        if(index != -1)
            System.out.println(y+" Element found at index" + index);
        
         else
            System.out.println(y+"Element not found" );
            //break;
        
            //return 0;
//System.out.println(y+"Element found at index" + h);*/
}
}