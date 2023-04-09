public class MatOps 
{
    // anything in this file will have to do with operations that happen on more than one matrix   

    // dot product
    // multiply matrix
    // double row/col operations on two different matrices

    public Matrix copyMatrix(Matrix m)
    {
        Matrix copy = new Matrix(m.rows, m.cols);

        for (int i = 0; i < m.rows; i++)
        {
            for (int j = 0; j < m.cols; j++)
            {
                copy.matrix[i][j] = m.matrix[i][j];
            }
        }

        return copy;
    }

    public double dotProduct(Matrix mat1, Matrix mat2, int row, int col)
    {
        double sum = 0;
    
        for (int i = 0; i < mat1.cols; i++)
        {
            sum += mat1.matrix[row][i] * mat2.matrix[i][col];
        }

        return sum;
    } 

    public Matrix MatMult(Matrix mat1, Matrix mat2) 
    {   
        // Multiplies two matrices together and gives their result

        // Dynamically Allocates memory, remember to free after use

        Matrix result = new Matrix(mat1.rows, mat2.cols);

        for (int i = 0; i < mat1.rows; i++)
        {
            for (int j = 0; j < mat2.cols; j++)
            {
                result.matrix[i][j] = dotProduct(mat1, mat2, i, j);
            }
        }

        return result;
    }

    public Matrix invertMatrix(Matrix mat)
    {
        // gauss jordan elimination
        // MATRIX MUST BE SQUARE IN ORDER TO INVERT, IE ROWS AND COLUMNS EQUAL

        Matrix identity = mat.createIdentityMatrix(mat.rows, mat.cols);
        Matrix matCopy = copyMatrix(mat);
        Matrix idCopy = copyMatrix(identity);

        for (int p = 0; p < mat.rows; p++)
        {
            double f = mat.matrix[p][p];

            mat.rowDiv(p, f);
            identity.rowDiv(p, f);

            for (int i = p + 1; i < mat.rows; i++) 
            {
                f = mat.matrix[i][p];

                matCopy = copyMatrix(mat);
                idCopy = copyMatrix(identity);
                matCopy.rowMult(p, f);
                idCopy.rowMult(p, f);

                mat.seperateRowsDifferent(i, matCopy, p); 
                identity.seperateRowsDifferent(i, idCopy, p);
            }
        }

        for (int p = mat.rows - 1; p > -1; p--)
        {
            for (int i = p - 1; i > -1; i--)
            {
                double f = mat.matrix[i][p];

                matCopy = copyMatrix(mat);
                idCopy = copyMatrix(identity);

                matCopy.rowMult(p, f);
                idCopy.rowMult(p, f);

                mat.seperateRowsDifferent(i, matCopy, p); 
                identity.seperateRowsDifferent(i, idCopy, p);
            }
        }

        return identity;
    }
}
