package ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity;

public abstract class PhuongTien {
    private String bienKiemSoat;
    public HangSanXuat hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public static boolean kiemTraBienSo(String bienSo) {
        return bienSo.matches("[\u0041-\u005A]{1,2}[A-Z0-9]{1,2}-[0-9]{3}\\.[0-9]{2}");
    }

    public abstract String layThongTin();

    @Override
    public String toString() {
        return "Biển số: " + bienKiemSoat + ", Hãng: " + hangSanXuat.toString() + ", Năm SX: " + namSanXuat + ", Chủ sở hữu: " + chuSoHuu;
    }
}