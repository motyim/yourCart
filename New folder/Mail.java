message = "Thanks for buying from YourCart ^_^ <br/>"
                    + "your product will delivered in two days ..";
            
new MailModel(user.getEmail(), "Successfull Payment", message).sendMail();

// هنا انتي هتغيري الرساله بانك تقدر تشحن من موقعنا بالكود دا 
// اللي قيمتوا كدا .. 
// Successfull Payment == عنوان الرساله 
//طبعا الكود دا كلوا حطيه ف كومنت علشان انتي لسه مش استخدمتي الكلاس دا 