package hashAndBinary;



import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("my_words.txt");
        HashTable hashTable = new HashTable(10);
        file.createNewFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);
        int sizeOfDictionary = 0;
        String line;
        while((line = bReader.readLine())!=null){
            String[] splitLines = line.split(":",2);

            hashTable.add(splitLines[0],splitLines[1]);
            sizeOfDictionary++;
        }
        System.out.println(sizeOfDictionary);
        hashTable.print();

        bReader.close();
        fileReader.close();






    }

}
