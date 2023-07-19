### Product
- id
- name
- price
### Phone
- id
- name
- price
- phoneNumber
### SmartPhone
- id
- name
- price
- phoneNumber
- storage
- ram
- camera

1. Yukarıda belirtilen classları tanımlayın. (inheritance)
2. SmartPhone için hem no args constructor hem de all args constructor yazın.
3. Bir tane PhoneApp adında bir class oluşturun ve burada 5 tane alt alta SmartPhone
   tanımlayın. Bunları bir array in içine alın.
4. Bu class içinde bir metot tanımlayın.
   Double calculateTotalPrice(SmartPhone[] smartPhoneArray)
5. Main metot içinde bu tanımlanan telefonların toplam fiyatını console a yazdırın.