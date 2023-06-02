#include <stdio.h>
#include <conio.h>
#include <string.h>

struct IndexBlock {
    int blockNum;
};

int main() {
    static int b[20], i, j, blocks[20][20];
    char F[20][20], S[20], ch;
    int sb[20], eb[20], x, n;

    clrscr();
    printf("\nEnter the number of Files: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("\nEnter file %d name: ", i + 1);
        scanf("%s", F[i]);
        printf("Enter the number of blocks: ");
        scanf("%d", &b[i]);
    }

    for (i = 0; i < n; i++) {
        printf("\nEnter the starting block of file %d: ", i + 1);
        scanf("%d", &sb[i]);

        printf("Enter blocks for file %d:\n", i + 1);

        for (j = 0; j < b[i] - 1;) {
            printf("Enter block %d: ", j + 2);
            scanf("%d", &x);

            if (b[i] != 0) {
                blocks[i][j] = x;
                j++;
            } else {
                printf("\nInvalid block!");
            }
        }
    }

    printf("\nEnter the Filename: ");
    scanf("%s", S);

    for (i = 0; i < n; i++) {
        if (strcmp(F[i], S) == 0) {
            printf("\nFname\tBsize\tStart\tBlocks\n");
            printf("--------------------------------------\n");
            printf("%s\t%d\t%d\t", F[i], b[i], sb[i]);
            printf("%d->", sb[i]);

            for (j = 0; j < b[i]; j++) {
                if (b[i] != 0) {
                    printf("%d->", blocks[i][j]);
                }
            }
        }
    }

    printf("\n-------------------------------------------\n");
    getch();
    return 0;
}
