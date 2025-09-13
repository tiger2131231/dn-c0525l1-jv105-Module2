package ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.repository;



import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity.HangSanXuat;
import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository {
    public final String Xe_Tai_CSV = "XeTai_CSV";
    public final String oto_CSV = "oto_CSV";
    public final String Xe_May_CSV = "XeMay_CSV";
    public static List<PhuongTien> xeTaiList = new ArrayList<>();
    public static List<PhuongTien> otoList = new ArrayList<>();
    public static List<PhuongTien> xeMayList = new ArrayList<>();

    public static List<HangSanXuat> hangSanXuatList = List.of(
            new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"),
            new HangSanXuat("HSX-002", "Honda", "Nhật Bản"),
            new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"),
            new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"),
            new HangSanXuat("HSX-005", "Ford", "Mỹ"),
            new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"),
            new HangSanXuat("HSX-007", "Hino", "Nhật Bản")
    );

}
