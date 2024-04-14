# Workshop Java Swing: Lập trình hướng sự kiện

## Giới thiệu

Đây là LAB thực hành ôn tập sau Workshop phần JDBC

Mọi thắc mắc sau Workshop, bạn có thể gửi về Discord của IUH GDSC tại [đây](https://iuhgdsc.github.io/?l=discord)

## Import SQL:

Tìm file tại thư mục ``src/main/java/data/script.sql``

## Yêu cầu hiện thực các chức năng trong giao diện

1. Khi nhấn nút **Tải lại** ở tab Inbox, load dữ liệu từ database vào bảng

2. Hiện thực chức năng gửi email:

    Sau khi điền thông tin và nhấn gửi, email sẽ được lưu vào Database và có trạng thái DA_GUI

3. Hiện thực chức năng lưu bản nháp:

    Sau khi nhấn lưu bản nháp, dữ liệu sẽ được lưu vào database có trạng thái BAN_NHAP

4. Hiện thực chức năng chỉnh sửa: 
    Email sẽ được load sang Compose an email
    Vô hiệu hoá nút Chỉnh sửa email nếu email có trạng thái BAN_NHAP

