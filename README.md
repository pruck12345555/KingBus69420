* **นิสิต A**
  * ชื่อ-นามสกุล : ณพงศ์ธรณ์ สุวรรณรัตน์
  * รหัสนิสิต : 6610405841
  * github-username : busnapongtorn
* **นิสิต B**
    * ชื่อ-นามสกุล : ศุภวัชร สงแก้ว
    * รหัสนิสิต : 6610406057
    * github-username : pruck12345555
### สรุป git flow

* การเริ่มต้น
  * เริ่มต้นด้วยการใช้คำสั่ง git flow init เพื่อที่จะใช้ git flow ได้้
* feature
  * **git flow feature start** : สร้าง  branch ใหม่ขึ้นมาเพื่อการพัฒนาโค้ด
  * **git flow feature publish** : ใช้ในการส่ง feature ของเราให้ผู้อื่นที่ทำงานร่วมกัน
  * **git flow feature finish** : นำ feature แยกไปรวมกับ branch develop จากนั้นก็ลบ feature ทิ้ง
  * **git flow feature pull** : รับ feature จากผู้ใช้อื่นมา
* การ release
  * **การสร้าง release** : git flow release start [ชื่อหรือเวอร์ชั่นของ release]
  * **วิธี publish release** : git flow release publish [ชื่อหรือเวอร์ชั่นของ release]
  * **วิธี finish release** : git flow release finish  [ชื่อหรือเวอร์ชั่นของ release]
* การตั้งชื่อ release แบบ Semantic Versioning
  Ex. 4.7.6
  * **เลขหน้า(4)** : Major Version เป็นการเปลี่ยนแปลงใหญ่ที่อาจทำให้ซอฟท์แวร์ขัดข้องได้
  * **เลขกลาง(7)** : Minor Version เป็นการเพิ่มฟีเจอร์ต่างๆโดยไม่ต้องกังวลว่าโปรแกรมจะขัดข้อง
  * **เลขหลัง(6)** : Patch เป็นการแก้บั๊กต่างๆหรือการปรับปรุงเล็กๆน้อยๆโดยไม่มีฟีเจอร์ใหม่หรือการเปลี่ยนแปลงใหญ่ๆ