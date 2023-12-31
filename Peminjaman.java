public class Peminjaman {
    private Peminjam peminjam;
    private Petugas petugas;
    private Buku buku;

    public Peminjaman(Peminjam peminjam, Petugas petugas, Buku buku)throws Exception{

        if(!peminjam.isLogin()){
            throw new IllegalStateException("Peminjam belum login");
        }

        if(peminjam.getNamaPeminjam() == null){
            throw new NullPointerException("Nama peminjam tidak boleh null");
        }

        if(peminjam.getKodePeminjam() == null){
            throw new NullPointerException("Kode peminjam tidak boleh null");
        }
        this.peminjam = peminjam;
        this.petugas = petugas;
        this.buku = buku;
    }
    
    public Peminjam getPeminjam(){
        return peminjam;
    }

    public Petugas getPetugas(){
        return petugas;

    }

    public Buku getBuku(){
        return this.buku;
    }
}
    
