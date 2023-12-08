package absensiswa;

public class siswabaru{
    String nama;
    String jenkel;
    int umur;
    String kelas;
        
    public siswabaru(String nama, String jenkel, int umur, String kelas){
        this.nama = nama;
        this.jenkel = jenkel;
        this.umur = umur;
        this.kelas = kelas;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getJenkel(){
        return jenkel;
    }
    
     public int getUmur(){
        return umur;
    }  
     
    public String getKelas(){
        return kelas;
    }
    
    @Override
    public String toString(){
        return "Nama: " + nama + ", Jenis Kelamin: " + jenkel + ", Umur: " + umur + ", Kelas: " + kelas ;
    }
}