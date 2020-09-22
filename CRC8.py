import sys
def print_byte_codes(data):
  for n, c in enumerate(data):
    print(f"0x{c:02x}", end=" ")
    if n % 16 == 7:
      print(" ", end="")
    if n % 16 == 15:
      print()

def crc8(data):
  # put your code here
               
  return 0

if __name__ == "__main__":
  # execute only if run as a script
  if len(sys.argv) < 3:
    print(f"Usage: {sys.argv[0]} [input path] [output path]")
  else:
    input_path = sys.argv[1]
    output_path = sys.argv[2]
    
    # read data
    with open(input_path, "rb") as file:
      data = file.read()
    print("\nData")
    print_byte_codes(data)

    # convert data to BISYNC body
    crc = crc8(data)

    # combine input and crc to generate output file
    data_w_crc = b''

    print(f"\ncrc = 0x{crc:02x}")
    print("\nOutput")
    print_byte_codes(data_w_crc)
    
    # write output
    with open(output_path, "wb") as file:
      file.write(data_w_crc)
