package ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity;

 public class Oto extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String layThongTin() {
        return super.toString() + ", Kiểu xe: " + kieuXe + ", Số chỗ: " + soChoNgoi;
    }
}


