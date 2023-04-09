public class Matrix
{
    // matrix object has double matrix, int rows, int cols

    public double[][] matrix;
    public int rows;
    public int cols;

    public Matrix(int r, int c)
    {
        rows = r;
        cols = c;
        matrix = new double[r][c];
    }

    public Matrix(int r, int c, double[][] m)
    {
        rows = r;
        cols = c;
        matrix = new double[r][c];
    }

    public Matrix transpose()
    {
        double[][] t = new double[cols][rows];

        // this is going to have high miss rate in cache, maybe find better solution

        for (int i = 0; i < cols; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                t[i][j] = matrix[j][i];
            }
        }

        Matrix transposed = new Matrix(cols, rows, t);

        return transposed;
    }

    public void rowMult(int row, double val)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row][i] = matrix[row][i] * val;
        }
    }

    public void rowDiv(int row, double val)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row][i] = matrix[row][i] / val;
        }
    }

    public void rowAdd(int row, double val)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row][i] = matrix[row][i] + val;
        }
    }

    public void rowSub(int row, double val)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row][i] = matrix[row][i] - val;
        }
    }

    public void colMult(int col, double val)
    {
        for (int i = 0; i < rows; i++)
        {
            matrix[i][col] = matrix[i][col] * val;
        }
    }

    public void colDiv(int col, double val)
    {
        for (int i = 0; i < rows; i++)
        {
            matrix[i][col] = matrix[i][col] / val;
        }
    }

    public void colAdd(int col, double val)
    {
        for (int i = 0; i < rows; i++)
        {
            matrix[i][col] = matrix[i][col] + val;
        }
    }

    public void colSub(int col, double val)
    {
        for (int i = 0; i < rows; i++)
        {
            matrix[i][col] = matrix[i][col] - val;
        }
    }

    public void combineRows(int row1, int row2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row1][i] = matrix[row1][i] + matrix[row2][i];
        }
    }

    public void combineRowsDifferent(int row1, Matrix mat2, int row2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row1][i] = matrix[row1][i] + mat2.matrix[row2][i];
        }
    }

    public void seperateRows(int row1, int row2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row1][i] = matrix[row1][i] - matrix[row2][i];
        }
    }

    public void seperateRowsDifferent(int row1, Matrix mat2, int row2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row1][i] = matrix[row1][i] - mat2.matrix[row2][i];
        }
    }

    public void multiplyRows(int row1, int row2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row1][i] = matrix[row1][i] * matrix[row2][i];
        }
    }

    public void divideRows(int row1, int row2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[row1][i] = matrix[row1][i] / matrix[row2][i];
        }
    }

    public void combineCols(int col1, int col2)
    {
        for (int i = 0; i < rows; i++)
        {
            matrix[i][col1] = matrix[i][col1] + matrix[i][col2];
        }
    }

    public void seperateCols(int col1, int col2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[i][col1] = matrix[i][col1] - matrix[i][col2];
        }
    }

    public void multiplyCols(int col1, int col2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[i][col1] = matrix[i][col1] * matrix[i][col2];
        }
    }

    public void divideCols(int col1, int col2)
    {
        for (int i = 0; i < cols; i++)
        {
            matrix[i][col1] = matrix[i][col1] / matrix[i][col2];
        }
    }

    public Matrix createIdentityMatrix(int rows, int cols)
    {
        double[][] id = new double[rows][cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (i == j) id[i][j] = 1;
                else id[i][j] = 0;
            }
        }

        Matrix identityMatrix = new Matrix(rows, cols, id);

        return identityMatrix;
    }  
}