package absensiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerSiswa {
    ArrayList<siswabaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerSiswa(){
        ArrayData = new ArrayList<siswabaru>();
    }
    
    public void InsertData (String nama, String jenkel, int umur, String kelas){
        siswabaru sws = new siswabaru(nama, jenkel, umur, kelas);
        ArrayData.add (sws);
    }
    public DefaultTableModel showData(){
        String[] kolom = { "Nama", "Jenis Kelamin", "Umur", "Kelas" };
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(siswabaru n : ArrayData){
            String[] arrData = {n.getNama(), n.getJenkel(), String.valueOf(n.umur), n.getKelas()};
            objData[i] = arrData;
            i++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tablelist;
    }    
}
