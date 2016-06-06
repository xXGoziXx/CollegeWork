#include "stdafx.h"
#include <math.h>

void print_binary(char*, unsigned int);

int _tmain(int argc, _TCHAR* argv[])
{
	unsigned int x;

	do {
		printf("Enter a number:");
		scanf_s(" %u", &x);
		print_binary("Input :", x);

		// Add your code here
		x = x ^ 8589934591;

		print_binary("Output:", x);
	} while (1);

	return 0;
}

void print_binary(char text[], unsigned int x)
{
	printf("%s", text);
	for (int i = 32; i >= 0; i--)
	{
		if (((x >> i) & 1) == 0) printf("0"); else printf("1");
	}
	printf("\n"); // Newline
}
