//Zac Sundre


#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {

   int i, n = 12;
   float r = .22, B = 5000.0, P;
   float I1, I2;

   printf("Enter your monthly payment: ");
   scanf("%f", &P);

   printf("\nr = %0.2f \n", r);
   printf("B = %0.2f \n", B);
   printf("P = %0.2f \n \n", P);

   for(i = 1; i <= 12; i++) {
      I1 = (r / 12) * B;
      n--;
      I2 = I2 + I1;
      printf("%d \t", i);
      printf("%0.2f \t", I1);
      printf("%0.2f \n", B);
      B = (B - P) + I1;
   }

   printf("\nTotal interest paid: %0.2f \n", I2); 
   
   return (0);
}


