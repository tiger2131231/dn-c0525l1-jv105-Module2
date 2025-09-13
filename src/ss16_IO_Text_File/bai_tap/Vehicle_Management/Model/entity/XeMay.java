package ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String layThongTin() {
        return super.toString() + ", Công suất: " + congSuat;
    }
}
