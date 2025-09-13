package ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity;

public class XeTai extends PhuongTien {
    private double trongTai;


    public XeTai(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public String layThongTin() {
        return super.toString() + ", Trọng tải: " + trongTai;
    }
}

