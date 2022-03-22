import os

#  ——————————————------批量修改文件名_csdn——————----------------------


def rename():
    i = 0
    path = r"work/image/ningjing"

    filelist = os.listdir(path)  # 该文件夹下所有的文件（包括文件夹）
    for files in filelist:  # 遍历所有文件
        i = i + 1
        Olddir = os.path.join(path, files)  # 原来的文件路径
        if os.path.isdir(Olddir):  # 如果是文件夹则跳过
            continue
        filename = 'new_'  # 文件名
        filetype = '.jpg'  # 文件扩展名
        Newdir = os.path.join(path, filename + str(i) + filetype)  # 新的文件路径
        os.rename(Olddir, Newdir)  # 重命名
    return True

# 以上为csdn版本


# ________批量创建文件_______----------------------------------------------------


def create_files():
    for i in range(3):
        file_name = 'op_file/' + str(i) + '.txt'
        print(file_name)
        f = open(file_name, 'w')
        f.close()


def create_files_1():
    os.chdir('op_file')
    for i in range(3, 5):
        file_name = str(i) + '.txt'
        print(file_name)
        f = open(file_name, 'w')
        f.close()
    os.chdir('../')


# ————————————批量修改文件名————————-——-----------------------------------------

# os.listdir(path)——————path为空值时为当前目录,返回值是文件名组成的列表
# os.rename(old_file, new_file)

# 增加前缀


def modify_filename():
    os.chdir('op_file')   # 移到op_file文件夹下操作
    buf_list = os.listdir()
    for file in buf_list:
        new_file = 'new_' + file     # 修改后的文件名
        os.rename(file, new_file)
        print('文件' + os.path.abspath(file) + "已重命名为" + os.path.abspath(new_file))
    os.chdir('../')  # 回到上级目录


# 删掉前缀

def modify_filename_1():
    os.chdir('op_file')   # 移到op_file文件夹下操作
    buf_list = os.listdir()
    for file in buf_list:
        num = len('new_')
        new_file = file[num:]    # [num:]字符串切片———左闭右开
        os.rename(file, new_file)
        print('文件' + os.path.abspath(file) + "已重命名为" + os.path.abspath(new_file))
    os.chdir('../')  # 回到上级目录




if __name__ == '__main__':
    # rename()
    # create_files()
    # create_files_1()
    # modify_filename()
    modify_filename_1()

