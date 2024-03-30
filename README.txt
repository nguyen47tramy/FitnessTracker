A fitness tracker application that enables users to track their workouts, set fitness goals, and monitor their progress.

Một ứng dụng theo dõi luyện tập cho phép người dùng theo dõi tiến độ tập luyện, số calo đốt, đặt mục tiêu tập luyện.

Các tính năng chính trong APP: CRUD workout

package: data:
	- Excercise:(abstract) khuôn, mỗi excercise có id, name, equipment needed, set, rep.  Phương thức calculateCaloriesBurned(), calculateDuration(), @override ttString() printExcercise().
	- Kế thừa từ lớp excercise có các lớp excercise tập chung các nhóm cơ khác nhau (tập cùng các nhóm cơ nên phải được lưu trữ chung, có các thuộc tính chung) => ba lớp upper, lower, abs + thêm nhóm Cardio
	- Workout: Array của excercise, phải gennerate được ngẫu nhiên các exercise trong cùng một class excercise cụ thể để ghép lại thành một buổi tập
	- Plan

package _static: util:
	- 

package: ui:
	- Lựa chọn người dùng:
		- 1. Quản lý 
		- 2. Lên kế hoạch
		- 3. Thoát
	- Trong 1.Quản lý (CRUD)
		- Thêm bài tập
		- Chỉnh sửa bài tập
		- Xóa bài tập
		- In danh sách bài tập
		- Lưu danh sách bài tập
		- Trở lại
	- Trong 2. Lên kế hoạch tập luyện
		- Xem kế hoạch tập luyện hôm nay
		- Tạo mới kế hoạch tập luyện
		- Trở lại
	
Nhật ký:
23/3/2024: lên kế hoạch - tạo khuôn data
30/3/2024: tạo util quản lý dữ liệu nhập của người dùng