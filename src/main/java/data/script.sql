CREATE DATABASE IUHGDSC_Workshop_JavaSwing

use IUHGDSC_Workshop_JavaSwing

CREATE TABLE email (
  id INT PRIMARY KEY IDENTITY(1,1),  -- Use IDENTITY for auto-increment
  sender NVARCHAR(255) NOT NULL,
  receiver NVARCHAR(255) NOT NULL,
  subject NVARCHAR(255),
  body NVARCHAR(2000),
  status NVARCHAR(20) NOT NULL
);


INSERT INTO [dbo].[email]
           ([sender]
           ,[receiver]
           ,[subject]
           ,[body]
           ,[status])
     VALUES
           (N'core-team-members@iuhgdsc'
           ,N'all-members@iuhgdsc'
           ,N'[IUH GDSC] Workshop Java Swing: Lời cảm ơn'
           ,N'Hi,  Thật tuyệt vời vì được nhìn thấy rằng bạn vẫn đang ở đây cùng chúng tôi.  Nếu có bất kì câu hỏi nào, bạn có thể nhắn trong Discord hoặc đặt câu hỏi trực tiếp tại Workshop nhé!!  >> iuhgdsc.github.io/?l=discord'
           ,N'BAN_NHAP')
GO

