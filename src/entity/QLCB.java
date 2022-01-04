package entity;

import java.util.ArrayList;

import utils.ScannerUtil;

public class QLCB {
	private ArrayList<CanBo> mangCanBo;

	public QLCB() {
		mangCanBo = new ArrayList<>();
		int selected = 0;
		do {
			System.out.println(" ------ Chọn chức năng ------");
			System.out.println("1- Thêm cán bộ");
			System.out.println("2- In danh sách cán bộ");
			System.out.println("3- Tìm theo tên cán bộ");
			System.out.println("4- Xóa cán bộ");
			System.out.println("5- Thoát chương trình");

			selected = ScannerUtil.scanInt();

			switch (selected) {
			case 1: {
				addCanBo();
				break;
			}
			case 2: {
				printMangCanBo();
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				System.out.println("------GoodBye-------");
				break;
			}
			default:
				System.out.println("Chọn sai chức năng mời chọn lại.");
			}

		} while (selected != 5);

	}

	/**
	 * Phương thức in danh sách cán bộ
	 */
	private void printMangCanBo() {
		System.out.println("--------- Danh sách cán bộ ------------ ");
		
		System.out.println("------------------- Công nhân ------------------- ");
		System.out.printf(" %20s | %5s | %5s \n", "Ho-ten", "Tuoi", "Bac");
		for (CanBo canBo : mangCanBo) {
			if (canBo instanceof CongNhan) {
				CongNhan cNhan = (CongNhan) canBo;
				System.out.printf(" %20s | %5d | %5d \n", cNhan.getHoTen(), cNhan.getTuoi(), cNhan.getBac());
			}
		}
		
		System.out.println("------------------- Kỹ sư ------------------- ");
		System.out.printf(" %20s | %5s | %10s \n", "Ho-ten", "Tuoi", "Chuyen nganh");
		for (CanBo canBo : mangCanBo) {
			if (canBo instanceof KySu) {
				KySu kySu = (KySu) canBo;
				System.out.printf(" %20s | %5d | %10s \n", kySu.getHoTen(), kySu.getTuoi(), kySu.getNganhDaoTao());
			}
		}
		
		System.out.println("------------------- Nhân viên ------------------- ");
		System.out.printf(" %20s | %5s | %10s \n", "Ho-ten", "Tuoi", "Công việc");
		for (CanBo canBo : mangCanBo) {
			if (canBo instanceof NhanVien) {
				NhanVien nhanVien = (NhanVien) canBo;
				System.out.printf(" %20s | %5d | %10s \n", nhanVien.getHoTen(), nhanVien.getTuoi(), nhanVien.getCongViec());
			}
		}
	}

	/**
	 * Phương thức thêm cán bộ
	 */
	private void addCanBo() {
		int selected = 0;
		do {
			System.out.println("------ Thêm cán bộ, vui lòng chọn ------");
			System.out.println("1 - Thêm Công nhân");
			System.out.println("2 - Thêm Kỹ sư");
			System.out.println("3 - Thêm Nhân viên");
			System.out.println("4 - Thoát");
			selected = ScannerUtil.scanInt();

			switch (selected) {
			case 1: {
				System.out.println("---- Thêm Công nhân ----");
				System.out.print("Nhập vào tên công nhân : ");
				String hoTen = ScannerUtil.scanStr();
				System.out.print("Nhập vào tuổi công nhân : ");
				int tuoi = ScannerUtil.scanInt();
				System.out.print("Nhập vào bậc công nhân từ 1 -> 10: ");
				int bac = ScannerUtil.scanInt();

				//Tạo ra đối tượng công nhân
				CanBo cb = new CongNhan(hoTen, tuoi, bac);
				
				//Thêm cán bộ vào mảng
				mangCanBo.add(cb);

				break;
			}
			case 2: {
				System.out.println("---- Thêm Kỹ sư ----");
				System.out.print("Nhập vào tên kỹ sư: ");
				String hoTen = ScannerUtil.scanStr();
				System.out.print("Nhập vào tuổi kỹ sư : ");
				int tuoi = ScannerUtil.scanInt();
				System.out.print("Nhập chuyên ngành của kỹ sư: ");
				String nganh = ScannerUtil.scanStr();

				//Tạo ra đối tượng Kỹ sư
				CanBo cb = new KySu(hoTen, tuoi, nganh);
				
				//Thêm cán bộ vào mảng
				mangCanBo.add(cb);
				break;
			}
			case 3: {
				System.out.println("---- Thêm Nhân viên ----");
				System.out.print("Nhập vào tên nhân viên: ");
				String hoTen = ScannerUtil.scanStr();
				System.out.print("Nhập vào tuổi nhân viên : ");
				int tuoi = ScannerUtil.scanInt();
				System.out.print("Nhập công việc : ");
				String congViec = ScannerUtil.scanStr();

				//Tạo ra đối tượng Kỹ sư
				CanBo cb = new NhanVien(hoTen, tuoi, congViec);
				
				//Thêm cán bộ vào mảng
				mangCanBo.add(cb);
				break;
			}
			case 4: {
				break;
			}
			default:
				System.out.println("Chọn sai giá trị...");
			}

		} while (selected != 4);

	}

}
