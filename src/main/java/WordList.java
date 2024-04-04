import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int num = 0;
    for(int i = 0; i < myList.size(); i++) {
      if(myLIst.get(i).Length() == len) {
        num += 1;
      }
    }
    return num;
    
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = 0; i < myList.size(); i++) {
      if(myLIst.get(i).Length() == len) {
        myList.remove(i);
        i--;
      }
    }

  }
}
