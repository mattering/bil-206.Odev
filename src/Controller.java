import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller implements ActionListener {


    Model model;
    View view;
    Controller()
    {
        model = new Model();
        view = new View();
        view.bStart.addActionListener(this);
        view.add(view.bStart);

    }


    public  void execute(){


    }

    public void actionPerformed(ActionEvent e){
        if(view.charCount.isSelected())
        {

        }
        else if(view.wordCount.isSelected())
        {
            File file = new File(view.textField_1.getText());

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            String st;
            StringBuilder allText = new StringBuilder("");
            while (true)
            {
                try {
                    if (!((st = br.readLine()) != null)) break;
                    else {
                        allText.append(st);
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            String words[] = (allText.toString()).split("\\s");


            Arrays.sort(words);
           // for(int i=0;i< words.length;i++) System.out.print(words[i]+"   ");


            Map<String,Integer> map =new HashMap<String,Integer>();
            int counter=0;
            int j=0; //j is same checker index

            for(int i=0;i<words.length;i++)
            {
                if(words[i].equals(words[j]))
                {
                    counter++;
                }
                else {
                    map.put(words[j],counter);
                   // System.out.println(words[j]+ " : " + counter);

                    counter=0;
                    j=i;
                    i=i-1;

                }

            }
            if(counter!=0)
            {
                map.put(words[j],counter);
               // System.out.println(words[j]+ " : " + counter);
            }

            if(view.sort_ascending.isSelected())
            {
                Map<String,Integer>  sortedMap =  map.entrySet().
                        stream().
                        sorted(Map.Entry.comparingByKey()).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

                view.textArea.setText("");
                sortedMap.forEach((k, v) -> view.textArea.append((k + ":" + v+"\n")));

            }
            else if(view.sort_descending.isSelected())
            {
                Map<String,Integer>  sortedMapReverseOrder =  map.entrySet().
                        stream().
                        sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

                view.textArea.setText("");
                sortedMapReverseOrder.forEach((k, v) -> view.textArea.append((k + ":" + v + "\n")));
            }
            else if(view.sort_frequencyAscending.isSelected())
            {
                Map<String,Integer>  sortedMap =  map.entrySet().
                        stream().
                        sorted(Map.Entry.comparingByValue()).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

                view.textArea.setText("");
                sortedMap.forEach((k, v) -> view.textArea.append((k + ":" + v + "\n")));
            }
            else if(view.sort_frequencyDescending.isSelected())
            {
                Map<String,Integer>  sortedMapReverseOrder =  map.entrySet().
                        stream().
                        sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

                view.textArea.setText("");
                sortedMapReverseOrder.forEach((k, v) -> view.textArea.append((k + ":" + v + "\n")));

            }






        }

    }
}
