from selenium import webdriver

driver = webdriver.Chrome(executable_path = "/Users/rishikakammila/Downloads/chromedriver")
driver.get("https://www.facebook.com/")
driver.find_element_by_name("firstname").send_keys("nikilesh")
driver.find_element_by_name("lastname").send_keys("kammila")
driver.find_element_by_name("reg_email__").send_keys("nikilesh.md@gmail.com")
driver.find_element_by_name("reg_email_confirmation__").send_keys("nikilesh.md@gmail.com")
driver.find_element_by_name("reg_passwd__").send_keys("nikilesh@1996")
driver.find_element_by_name("birthday_day").send_keys("29")
driver.find_element_by_name("birthday_month").send_keys("sep")
driver.find_element_by_name("birthday_year").send_keys("1996")
driver.find_element_by_id("u_0_7").click()
