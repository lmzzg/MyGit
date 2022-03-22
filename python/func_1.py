# 定义函数
def add_num1(a, b):
   result = a + b
   print(result)
   return result

# 调⽤函数
add_num1('10', '10')
add_num1(10, 10)

print('= = = = =  =  = =  = =  = =  = = = = = == =  = = = = =  == = =  =  =  =  =  =  == =  ==')

def return_num():
    return 1, 2
result = return_num()
print(result) # (1, 2)
# return a, b 写法，返回多个数据的时候，默认是元组类型。
# return后面可以连接列表、元组或字典，以返回多个值。

print('= = = = =  =  = =  = =  = =  = = = = = == =  = = = = =  == = =  =  =  =  =  =  == =  ==')


def user_info(name, age, gender):
    print(f'您的名字是{name}, 年龄是{age}, 性别是{gender}')
user_info('TOM', 20, '男')
user_info('Rose', age=20, gender='女')
user_info('小明', gender='男', age=16)

print('= = = = =  =  = =  = =  = =  = = = = = == =  = = = = =  == = =  =  =  =  =  =  == =  ==')

if __name__ == '__main__':
    add_num1(1, 2)
    user_info('lmzzg', '18', '男')

