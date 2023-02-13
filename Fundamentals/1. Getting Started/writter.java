

// Class Implementation
public class TaxCalculator2022 extends parentClass implements TaxCalculator {
      @Override
      public double calculateTax() {
            return taxableIncome * 0.4;
      }
}


// Creating Interface
public interface TaxCalculator {
      double calculateTax();
}



/* 
1. parent classes extends keyword එක use කරලා inherit කරනවා
   interfaces implements keyword එක මගින් connect කරනවා
   (මේ දෙකම class implementation එකකදි භාවිතා කරන්න පුළුවන්)

2. අපි interfaces වලදි methods implement කරන්නේ නෑ declare කරනවා විතරයි
   එනිසා, implement කරන විට public/private භාවිතා කරන නිසා interfaces
   ඇතුළේ private/public භාවිතා කල යුතු නොවේ

3. Interfaces වලදි methods declare කරලා සිද්ධ වෙන්නෙත් methods override 
   වීම නිසා 'Override' annotation එක class implementation එකේදි භාවිතා
   කල යුතුයි
 */

// extra: Variables තමා declare කරන්නේ, Method declare නෙවේ implement කරනවා කියලා කියන්නේ