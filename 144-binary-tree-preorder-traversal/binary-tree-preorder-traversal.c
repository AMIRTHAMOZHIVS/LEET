/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 int countNodes(struct TreeNode* root) {
    if (!root) return 0;
    return 1 + countNodes(root->left) + countNodes(root->right);
}
void preorder(struct TreeNode* root, int* result, int* index) {
    if (!root) return;
    result[(*index)++] = root->val;   // store value
    preorder(root->left, result, index);
    preorder(root->right, result, index);
}
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
if (!root) {
        *returnSize = 0; 
        return NULL;
    }

    int count = countNodes(root);     
    *returnSize = count;

    int* result = (int*)malloc(sizeof(int) * count); 
    int index = 0;
    preorder(root, result, &index);   

    return result;
}