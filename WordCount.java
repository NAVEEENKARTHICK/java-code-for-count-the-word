    import java.io.BufferedReader;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;
     
    class WordCount 
    {
     public static void main(String[] args) throws 
    FileNotFoundException, IOException 
     {
     FileReader f=new FileReader("data.txt");
     BufferedReader b=new BufferedReader(f);
     ArrayList <String> words=new ArrayList<String>();
     String line,maxword="";
     while((line=b.readLine())!=null)
     
     {
     String s[]=line.split(" ");
     for(String t:s) words.add(t); 
     }
     int max=0;
     for(int i=0;i<words.size();i++)
     {
     int count=1;
     for(int j=i+1;j<words.size();j++)
     {
     if(words.get(i).equals(words.get(j))) count++;
     }
     if(count>max)
     {
     max=count;
     maxword=words.get(i);
     }
     }
     System.out.println("The highest occurring word is: "+maxword+". It occurred "+max+" times.");
     }
    }
    
    

