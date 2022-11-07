package PBOSesi5;

import java.util.ArrayList;

public class Dosen extends Orang{
    private int jmlmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address){
        super(name, address);
        jmlmatkul = 0;
        matkuList = new ArrayList<>();

    }

    public boolean addCourse(String course){

        if(matkuList.contains(course)){
            System.out.println("matkul ini sudah ada pak!");
            return false;
        }

        jmlmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course){

        if(!matkuList.contains(course)){
            System.out.println("matkul yang mau di hapus sudah tidak ada");
            return false;
        }

        jmlmatkul--;
        matkuList.remove(course);
        return true;
        
    }

    public int getjmlmatkul() {
        return jmlmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\njumlah mata kuliah yang diampu : " + getjmlmatkul();
    }


}