package Mapa;

import java.io.*;

/**
 * Created by SCIP on 15.07.2016.
 */
public class Tools<E> implements Serializable {
    private final File file;

    public Tools(String name) {
        this.file = new File(name);
    }

    public void exportObject(E element ){
        OutputStream outputStream;
        ObjectOutputStream objectOutputStream = null;

        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            if (objectOutputStream != null) {
                objectOutputStream.writeObject(element);
                objectOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public Zooclub importObject(){
        if(file.exists()){
            try(InputStream is = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(is)){
                Object obj = ois.readObject();
                if(obj instanceof Zooclub){
                    Zooclub zooclub = (Zooclub) obj;
                    return zooclub;
                }
            }catch (IOException | ClassNotFoundException e) {
            }
        }
        return new Zooclub();

    }
}
