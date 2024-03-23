A fitness tracker application that enables users to track their workouts, set fitness goals, and monitor their progress.

Một ứng dụng theo dõi luyện tập cho phép người dùng theo dõi tiến độ tập luyện, số calo đốt, đặt mục tiêu tập luyện.

Các tính năng chính trong APP: CRUD workout

package: data:
	- Excercise:(abstract) khuôn, mỗi excercise có thời gian tập, lượng calo đốt
	- Kế thừa từ lớp excercise có các lớp excercise tập chung các nhóm cơ khác nhau (tập cùng các nhóm cơ nên phải được lưu trữ chung, có các thuộc tính chung) => ba lớp upper, lower, abs + thêm nhóm Cardio
	- Workout: Array của excercise, phải gennerate được ngẫu nhiên các exercise trong cùng một class excercise cụ thể để ghép lại thành một buổi tập

package _static: util:
	- 