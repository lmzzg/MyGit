import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import random

# s = pd.Series(['a','b','c','d','e'],index=[100,200,100,400,500])
# print(s[100])


score = np.random.randint(40, 100, (10, 5))
score_df = pd.DataFrame(score)
# 构造行索引序列
subjects = ["语文", "数学", "英语", "政治", "体育"]

# 构造列索引序列
stu = ['同学' + str(i) for i in range(score_df.shape[0])]

# 添加行索引
data = pd.DataFrame(score, columns=subjects, index=stu)
# print(data['语文'])
# 取某列 data.语文、data.iloc[:, 3]--第四列
# 取某几列data[['','',..]]、data.iloc[:,:3]--前三列、
# 取某行：data[2:3]-第三行，data.iloc[2, :]-第三行、
# 取某几行 data.iloc[:3, ]--第2，3行
# 取某几行某几列 data.iloc[1:3, 1:3]--第2，3行，第2，3列

# 取特定位置 data.iloc[2:3, 2:3] -- 第三行第三列元素







