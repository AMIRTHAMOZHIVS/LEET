


typedef struct {
    int* array;
    int size;
    int capacity;
} MinHeap;

typedef struct {
    MinHeap* minHeap;
    int k;
} KthLargest;

void swap(int* x, int* y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void heapifyDown(MinHeap* minHeap, int index) {
    int smallest = index;
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    if (leftChild < minHeap->size && minHeap->array[leftChild] < minHeap->array[smallest])
        smallest = leftChild;

    if (rightChild < minHeap->size && minHeap->array[rightChild] < minHeap->array[smallest])
        smallest = rightChild;

    if (smallest != index) {
        swap(&minHeap->array[index], &minHeap->array[smallest]);
        heapifyDown(minHeap, smallest);
    }
}

void heapifyUp(MinHeap* minHeap, int index) {
    if (index && minHeap->array[(index - 1) / 2] > minHeap->array[index]) {
        swap(&minHeap->array[(index - 1) / 2], &minHeap->array[index]);
        heapifyUp(minHeap, (index - 1) / 2);
    }
}

MinHeap* createMinHeap(int capacity) {
    MinHeap* minHeap = (MinHeap*)malloc(sizeof(MinHeap));
    minHeap->array = (int*)malloc(capacity * sizeof(int));
    minHeap->size = 0;
    minHeap->capacity = capacity;
    return minHeap;
}

void insertMinHeap(MinHeap* minHeap, int val) {
    if (minHeap->size < minHeap->capacity) {
        minHeap->array[minHeap->size] = val;
        minHeap->size++;
        heapifyUp(minHeap, minHeap->size - 1);
    } else if (minHeap->array[0] < val) {
        minHeap->array[0] = val;
        heapifyDown(minHeap, 0);
    }
}

int extractMin(MinHeap* minHeap) {
    if (minHeap->size <= 0)
        return -1;

    int root = minHeap->array[0];

    if (minHeap->size > 1) {
        minHeap->array[0] = minHeap->array[minHeap->size - 1];
        heapifyDown(minHeap, 0);
    }
    minHeap->size--;

    return root;
}

int getMin(MinHeap* minHeap) {
    return minHeap->array[0];
}

KthLargest* kthLargestCreate(int k, int* nums, int numsSize) {
    KthLargest* obj = (KthLargest*)malloc(sizeof(KthLargest));
    obj->k = k;
    obj->minHeap = createMinHeap(k);

    for (int i = 0; i < numsSize; i++) {
        insertMinHeap(obj->minHeap, nums[i]);
    }

    return obj;
}

int kthLargestAdd(KthLargest* obj, int val) {
    insertMinHeap(obj->minHeap, val);
    return getMin(obj->minHeap);
}

void kthLargestFree(KthLargest* obj) {
    free(obj->minHeap->array);
    free(obj->minHeap);
    free(obj);
}

/**
 * Your KthLargest struct will be instantiated and called as such:
 * KthLargest* obj = kthLargestCreate(k, nums, numsSize);
 * int param_1 = kthLargestAdd(obj, val);
 * kthLargestFree(obj);
 */