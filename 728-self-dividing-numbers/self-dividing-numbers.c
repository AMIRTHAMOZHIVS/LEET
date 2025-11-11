bool is_self_dividing( int num );

/* START ---- dynamic list functions ---- START */
struct List* newListInt( size_t size );
struct List* pushListInt( struct List*, int val );
int popListInt( struct List* );

struct List {
    size_t length;
    size_t limit;
    int*   data;
};
/* END ---- dynamic list functions ---- END */

/* main functionality to find self dividing numbers in [left, right] */
int* selfDividingNumbers(int left, int right, int* returnSize) 
{
    struct List* list = newListInt(0);

    for ( int i=left; i <= right; i++ ) {
        if ( is_self_dividing( i ) ) {
            pushListInt( list, i );
        }
    }

    returnSize[0] = list->length;
    const int* res = list->data;
    free(list);
    return res;
}

bool is_self_dividing( int num )
{
    int orig = num;
    while ( num ) {
        int last_digit = num % 10;
        if ( last_digit == 0 || orig % last_digit != 0 ) {
            return false;
        }
        num /= 10;
    }
    return true;
}

/* START ---- dynamic list functionality ---- START */
struct List* newListInt( size_t size )
{
    struct List* x = (struct List*) malloc( sizeof(struct List) );
    if ( !x ) return NULL;

    *x = (struct List) { 
        .length = 0, 
        .limit = (int) fmax(100, size),
        .data = NULL,
    };

    x->data = (int*) malloc( x->limit * sizeof(int) );
    if ( !x->data ) {
        free(x); return NULL;
    }

    return x;
}

struct List* pushListInt( struct List* x, int val )
{
    x->length++;
    if ( x->length == x->limit ) {
        x->limit *= 2;
        x->data = (int*) reallocarray( x->data, x->limit, sizeof(int) );
        if (!x->data) {
            free(x); return NULL;
        }
    }

    x->data[x->length-1] = val;
    return x;
}

int popListInt( struct List* )
{
    return -1;
}

/* END ---- dynamic list functionality ---- END */