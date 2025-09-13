package ss16_IO_Text_File.bai_tap.Vehicle_Management.Controller;


import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity.HangSanXuat;
import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity.Oto;
import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity.XeMay;
import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.entity.XeTai;
import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.repository.PhuongTienRepository;
import ss16_IO_Text_File.bai_tap.Vehicle_Management.Model.service.PhuongTienService;

import java.util.Scanner;

public class VehicleController {
    private final PhuongTienService service = new PhuongTienService();
    private final Scanner scanner = new Scanner(System.in);

    public void menuChinh() {
        while (true) {
            System.out.println("==== CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN ====");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiện thị danh sách phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm phương tiện");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1 -> themMoi();
                case 2 -> hienThi();
                case 3 -> xoa();
                case 4 -> timkiem();
                case 5 -> System.exit(0);
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void themMoi() {
        System.out.println("1. Xe tải 2. Ô tô 3. Xe máy");
        int loai = Integer.parseInt(scanner.nextLine());
        System.out.print("Biển kiểm soát: ");
        String bienSo = scanner.nextLine();

        System.out.println("Chọn hãng sản xuất:");
        for (int i = 0; i < PhuongTienRepository.hangSanXuatList.size(); i++) {
            System.out.println((i + 1) + ". " + PhuongTienRepository.hangSanXuatList.get(i).toString());
        }
        int hangIndex = Integer.parseInt(scanner.nextLine()) - 1;
        HangSanXuat hang = PhuongTienRepository.hangSanXuatList.get(hangIndex);

        System.out.print("Năm sản xuất: ");
        int nam = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String chu = scanner.nextLine();

        switch (loai) {
            case 1 -> {
                System.out.print("Trọng tải: ");
                double trongTai = Double.parseDouble(scanner.nextLine());
                service.themMoi(new XeTai(bienSo, hang, nam, chu, trongTai), "xeTai");
            }
            case 2 -> {
                System.out.print("Số chỗ ngồi: ");
                int cho = Integer.parseInt(scanner.nextLine());
                System.out.print("Kiểu xe: ");
                String kieu = scanner.nextLine();
                service.themMoi(new Oto(bienSo, hang, nam, chu, cho, kieu), "oto");
            }
            case 3 -> {
                System.out.print("Công suất: ");
                double congSuat = Double.parseDouble(scanner.nextLine());
                service.themMoi(new XeMay(bienSo, hang, nam, chu, congSuat), "xeMay");
            }
            default -> System.out.println("Loại phương tiện không hợp lệ!");
        }
    }

    private void hienThi() {
        System.out.println("1. Xe tải 2. Ô tô 3. Xe máy");
        int loai = Integer.parseInt(scanner.nextLine());
        service.hienThi(loai == 1 ? "xeTai" : loai == 2 ? "oto" : "xeMay");
    }

    private void xoa() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienSo = scanner.nextLine();
        service.xoaPhuongTien(bienSo);
    }
    private void timkiem() {
        System.out.println("Nhập biển kiểm soát");
        String bienSo = scanner.nextLine();
        service.timkiemPhuongTien(bienSo);
    }
}
